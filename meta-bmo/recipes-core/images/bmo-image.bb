inherit core-image


SUMMARY = "BMO Image"
DESCRIPTION = "This is a simple weston test image."

LICENSE = "MIT"

# add image features
IMAGE_FEATURES += "debug-tweaks weston"


IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"


# add extra packages
IMAGE_INSTALL:append = " \
        packagegroup-core-boot \
        vim \
        python3 \
        net-tools \
        curl \
        wget"

IMAGE_INSTALL:append = " hello-world"