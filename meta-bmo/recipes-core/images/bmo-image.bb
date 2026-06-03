inherit core-image


SUMMARY = "BMO Simple Image"
DESCRIPTION = "This is a simple test image with no gui."

LICENSE = "MIT"

# add image features
IMAGE_FEATURES += "debug-tweaks" 


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



IMAGE_INSTALL:append = " hello-world"