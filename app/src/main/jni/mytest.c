#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_gzys_jnitest_Main_hellojni(JNIEnv *env, jobject instance)
{
    // TODO
    return (*env)->NewStringUTF(env, "hello jni my test");
}

JNIEXPORT void JNICALL
Java_com_gzys_jnitest_Main_CallBack(JNIEnv *env, jobject instance)
{
    // TODO
    jclass clazz = (*env)->FindClass(env,"com/gzys/jnitest/Main");
    jmethodID methodid = (*env)->GetMethodID(env,clazz,"test","()V");
    (*env)->CallVoidMethod(env,instance,methodid);
}