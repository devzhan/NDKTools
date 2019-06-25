LOCAL_PATH  := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_LDLIBS :=-llog
LOCAL_MODULE    := ndkdemotest-jni

LOCAL_SRC_FILES := ndkdemotest.cpp

include $(BUILD_SHARED_LIBRARY)