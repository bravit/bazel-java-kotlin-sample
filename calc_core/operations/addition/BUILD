load(":gen_tests.bzl", "generate_add_tests")

java_library(
    name = "calc_add",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = ["//calc_core:calc_core"],
    visibility = ["//visibility:public"],
)


generate_add_tests(
        name = "add_function",
        test_cases = [
            (2, 3, 5),
            (0, 0, 0),
            (-1, 4, 3),
            (10, -5, 5),
        ],
    )
