inherit core-image


SUMMARY = "BMO Simple Image"
DESCRIPTION = "This is a simple test image with no gui."

LICENSE = "MIT"

MACHINE_FEATURES:append = " wifi bluetooth"
DISTRO_FEATURES:append = " wifi bluetooth"


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

KERNEL_MODULE_AUTOLOAD:append = " brcmfmac brcmutil btbcm hci_uart"

IMAGE_INSTALL:append = " \
        linux-firmware-bcm43455 \
        linux-firmware-rpidistro-bcm43430 \
        linux-firmware-rpidistro-bcm43455 \
        bluez-firmware-rpidistro-bcm43430a1-hcd \
        bluez-firmware-rpidistro-bcm4345c0-hcd \
        bluez5 \
        bluez5-testtools \
        wpa-supplicant \
        iw \
        kernel-module-brcmfmac \
        kernel-module-brcmutil \
        kernel-module-btbcm \
        kernel-module-hci-uart \
"

RPI_EXTRA_CONFIG:append = "\ndtoverlay=miniuart-bt\n"

IMAGE_INSTALL:append = " hello-world"