inherit core-image


SUMMARY = "BMO Image"
DESCRIPTION = "This is a simple qt test image with gui."

LICENSE = "MIT"

# add image features
IMAGE_FEATURES += "debug-tweaks weston opengl" 


IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"


# some tools
IMAGE_INSTALL:append = " \
        packagegroup-core-boot \
        vim \
        python3 \
        net-tools \
        curl \
        wget \
"

# qt packages
IMAGE_INSTALL:append = " \
        qtbase \
        qtdeclarative \
        qtwayland \
        qttools \
"

IMAGE_INSTALL:append = " hello-world qt-calc-app"