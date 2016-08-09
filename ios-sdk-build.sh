#!/bin/sh

#
# BUILD moe ios sdk
# 

qualifier="$1"
build_number="$2"
target_repo="$3"
repo_user="$4"
repo_pass="$5"

export MOE_PRIVATE_MAVEN_ADDR_1=$target_repo
export MOE_PRIVATE_MAVEN_USER_1=$repo_user
export MOE_PRIVATE_MAVEN_PASS_1=$repo_pass

export BUILD_NUMBER=$build_number
export PUBLISH_TARGET_REPO_ADDR=$target_repo
export PUBLISH_TARGET_REPO_USER=$repo_user
export PUBLISH_TARGET_REPO_PASS=$repo_pass

cd "moe.iOS"

./gradlew publish -Pmoe.publish.qualifier=$qualifier
