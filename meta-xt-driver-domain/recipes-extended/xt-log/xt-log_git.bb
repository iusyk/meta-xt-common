DESCRIPTION = "C++ header only log"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/xen-troops/${BPN}.git;branch=yocto-v4.7.0-xt0.1;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit pkgconfig cmake
