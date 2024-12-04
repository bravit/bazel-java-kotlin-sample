package(default_visibility = ["//visibility:public"])

java_binary(
    name = "calc_cli",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [
         "//calc_core:calc_core",
         "//calc_core/operations/addition:calc_add",
         "//calc_core/operations/multiplication:calc_mult",
         "//calc_div:kotlin-div",
         "//calc_sub:kotlin-sub"
    ],
    javacopts = [
        "--release", "14",  # Or "-source", "14", "-target", "14"
    ],
    main_class = "pro.bravit.calc.cli.CalcCli",
)

load(":rules.bzl", "calc_cli_with_binary")

calc_cli_with_binary(
    name = "calc_runner",
    operation = "5 * 3"
)
