# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aab6e79863d0b5ccb22aad513aa0f90e"

SRC_URI = "git://github.com/danishprakash/dash.git;protocol=https;branch=master \
			file://0001-makefile-yocto-fix.patch \
			file://0002-added-patch-message.patch"

# Modify these as desired
PV = "1.0+git"
SRCREV = "a9481f4a453f0ad25d9c9068c7b6e47253532deb"

S = "${WORKDIR}/git"


# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.


do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake 
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	install -d ${D}${bindir}
	install -m 0755 ${S}/dash ${D}${bindir}/dash
}

