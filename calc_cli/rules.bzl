def _calc_cli_with_binary_impl(ctx):
    out = ctx.actions.declare_file("hello")
    ctx.actions.write(
        output = out,
        content = """\
#!/bin/sh
pwd
sh ../../calc_cli "%s" | tail -1
""" % (ctx.attr.operation))
    return [DefaultInfo(
        files = depset([out]),
        executable = out,
    )]

calc_cli_with_binary = rule(
    implementation = _calc_cli_with_binary_impl,
    attrs = {
        "operation": attr.string()
    },
    executable = True,
)
