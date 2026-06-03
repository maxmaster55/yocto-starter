LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://git@github.com/maxmaster55/QT_QML_tasks.git;protocol=ssh;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "e284e70f83c17e9ed3cfe19bdcdc9fc87035a2c1"

S = "${WORKDIR}/git/t02_calc"

DEPENDS = "\
    qtbase \
    qtdeclarative \
    qtdeclarative-native \
"
RDEPENDS:${PN} += "\
    qtbase \
    qtdeclarative \
    qtdeclarative-native \
"
# NOTE: unable to map the following CMake package dependencies: Qt6
inherit cmake qt6-cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""


do_install() {
    cmake_do_install
}

FILES:${PN} = "${bindir}/*"
