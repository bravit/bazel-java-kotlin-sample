

load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "kotlin-sub",
    srcs = glob(["src/main/**/*.kt"]),
    deps = ["//calc_core:calc_core"],
    visibility = ["//visibility:public"],
)
