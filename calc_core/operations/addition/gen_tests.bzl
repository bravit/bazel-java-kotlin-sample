def generate_add_tests(name, test_cases):
    """Generate test files for the `add` function from a list of triples."""
    generated_files = []

    for i, case in enumerate(test_cases):
        input1, input2, expected = case
        test_name = "%s_test_%d" % (name, i)
        test_class = "AddFunctionTest%d" % i  # Match the class name
        test_content = """
            import static org.junit.Assert.assertEquals;
            import org.junit.Test;
            import pro.bravit.calc.operations.Addition;

            public class %s {
                @Test
                public void testAdd() {
                    Addition add = new Addition();
                    double result = add.apply((double) %d, (double) %d);
                    assertEquals((double) %d, result, 0.001);
                }
            }
        """ % (test_class, input1, input2, expected)

        native.genrule(
            name = test_name + "_src",
            outs = [test_class + ".java"],
            cmd = "echo '%s' > $@" % test_content,
        )

        native.java_test(
            name = test_name,
            srcs = [test_class + ".java"],
            deps = [":calc_add"],
            test_class = test_class,  # Explicitly set the test class name
        )

    return generated_files