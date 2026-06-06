# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "git://git@github.com/COVESA/capicxx-core-runtime.git;protocol=ssh;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "0e1d97ef0264622194a42f20be1d6b4489b310b5"

S = "${WORKDIR}/git"

DEPENDS = "boost"
PROVIDES = "commonapi3 commonapi-core"

# NOTE: unable to map the following CMake package dependencies: Doxygen
inherit cmake pkgconfig lib_package


CXXFLAGS += "-include string"

EXTRA_OECMAKE += " \
    -DCMAKE_INSTALL_PREFIX=/usr \
    -DINSTALL_LIB_DIR:PATH=${baselib} \
    -DINSTALL_CMAKE_DIR:PATH=${baselib}/cmake/CommonAPI \
"

FILES_${PN}-dev += "${libdir}/cmake"