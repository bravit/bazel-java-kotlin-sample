load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library", "kt_jvm_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

kt_jvm_library(
    name = "kotlin-div",
    srcs = glob(["src/main/**/*.kt"]),
    deps = ["//calc_core:calc_core"],
    visibility = ["//visibility:public"],
)

kt_jvm_test(
    name = "kotlin_div_test",
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=pro.bravit.calc.operations",
    ],
    srcs = glob(["src/test/kotlin/**/*.kt"]),
    deps = [
        ":kotlin-div",          # Dependency on the library being tested
        artifact("org.junit.jupiter:junit-jupiter-api"),
        artifact("org.junit.platform:junit-platform-console-standalone"),
    ],

)