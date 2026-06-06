LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "git://git@github.com/COVESA/vsomeip.git;protocol=ssh;branch=master"

# Modify these as desired
PV = "1.0+git"

SRCREV = "6171fdfe109a3af8fb64190136029aadd1fa0c6f"

DEPENDS = "boost"
provides = "vsomeip3 someip"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DINSTALL_LIB_DIR:PATH=${baselib} \
                 -DINSTALL_CMAKE_DIR:PATH=${baselib}/cmake/vsomeip3 \
                "

do_compile:append() {
    cmake_runcmake_build --target examples
}

do_install:append() {
    install -d ${D}${sysconfdir}/vsomeip
    mv ${D}/usr/etc/vsomeip/* ${D}${sysconfdir}/vsomeip/ 2>/dev/null || true
    rmdir ${D}/usr/etc/vsomeip ${D}/usr/etc 2>/dev/null || true
}


PACKAGES =+ "${PN}-tools"
FILES:${PN}-tools = "${bindir}"
RDEPENDS:${PN}-tools = "${PN}"