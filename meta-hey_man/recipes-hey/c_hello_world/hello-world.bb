SUMMARY = "Hello World recipe in c"
DESCRIPTION = "Recipe to test compilation in c for yocto"
LICENSE = "CLOSED"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*            Hello World app in c             *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build


SRC_URI = "git://github.com/maxmaster55/c_hello_world.git;protocol=https;branch=main"

SRCREV = "8bb4f38a68211dedc674a98932b6b3f9c2f9ddd9"


do_compile(){
    ${CC} ${CFLAGS} ${LDFLAGS} -o ${B}/hello_world ${WORKDIR}/git/hello_world.c
}