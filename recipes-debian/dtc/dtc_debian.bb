require ${COREBASE}/meta/recipes-kernel/dtc/dtc.inc

LIC_FILES_CHKSUM = "file://GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
		    file://libfdt/libfdt.h;beginline=3;endline=52;md5=fb360963151f8ec2d6c06b055bcbb68c"

# clear SRC_URI
SRC_URI = ""
inherit debian-package
require recipes-debian/sources/device-tree-compiler.inc
FILESPATH_append = ":${COREBASE}/meta/recipes-kernel/dtc/dtc"

SRC_URI += "file://make_install.patch"

BBCLASSEXTEND = "native nativesdk"
