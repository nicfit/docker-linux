ARG TAG=local
FROM nicfit/archlinux-base:${TAG}
MAINTAINER <nicfit@gmail.com>

RUN pacman -Syu --noconfirm --needed \
                jre-openjdk