package org.tensorflow.codelabs.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0015J\u0012\u0010&\u001a\u00020\u00132\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\u0013H\u0002J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "captureImageFab", "Landroid/widget/Button;", "currentPhotoPath", "", "getImageFab", "imgSampleOne", "Landroid/widget/ImageView;", "imgSampleThree", "imgSampleTwo", "inputImageView", "tvPlaceholder", "Landroid/widget/TextView;", "createImageFile", "Ljava/io/File;", "debugPrint", "", "results", "", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "dispatchTakePictureIntent", "drawDetectionResult", "Landroid/graphics/Bitmap;", "bitmap", "detectionResults", "Lorg/tensorflow/codelabs/objectdetection/DetectionResult;", "getCapturedImage", "getSampleImage", "drawable", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openAlbum", "rotateImage", "source", "angle", "", "runObjectDetection", "setViewAndDetect", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TFLite - ODT";
    public static final int REQUEST_IMAGE_CAPTURE = 1;
    public static final int REQUEST_GALLERY = 2;
    private static final float MAX_FONT_SIZE = 96.0F;
    private android.widget.Button captureImageFab;
    private android.widget.ImageView inputImageView;
    private android.widget.ImageView imgSampleOne;
    private android.widget.ImageView imgSampleTwo;
    private android.widget.ImageView imgSampleThree;
    private android.widget.TextView tvPlaceholder;
    private java.lang.String currentPhotoPath;
    private android.widget.Button getImageFab;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * onClick(v: View?)
     *     Detect touches on the UI components
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void openAlbum() {
    }
    
    /**
     * runObjectDetection(bitmap: Bitmap)
     *     TFLite Object Detection function
     */
    private final void runObjectDetection(android.graphics.Bitmap bitmap) {
    }
    
    private final void debugPrint(java.util.List<? extends org.tensorflow.lite.task.vision.detector.Detection> results) {
    }
    
    /**
     * setViewAndDetect(bitmap: Bitmap)
     *     Set image to view and call object detection
     */
    private final void setViewAndDetect(android.graphics.Bitmap bitmap) {
    }
    
    /**
     * getCapturedImage():
     *     Decodes and crops the captured image from camera.
     */
    private final android.graphics.Bitmap getCapturedImage() {
        return null;
    }
    
    /**
     * getSampleImage():
     *     Get image form drawable and convert to bitmap.
     */
    private final android.graphics.Bitmap getSampleImage(int drawable) {
        return null;
    }
    
    /**
     * rotateImage():
     *    Decodes and crops the captured image from camera.
     */
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    /**
     * createImageFile():
     *    Generates a temporary image file for the Camera app to write to.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    /**
     * dispatchTakePictureIntent():
     *    Start the Camera app to take a photo.
     */
    private final void dispatchTakePictureIntent() {
    }
    
    /**
     * drawDetectionResult(bitmap: Bitmap, detectionResults: List<DetectionResult>
     *     Draw a box around each objects and show the object's name.
     */
    private final android.graphics.Bitmap drawDetectionResult(android.graphics.Bitmap bitmap, java.util.List<org.tensorflow.codelabs.objectdetection.DetectionResult> detectionResults) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/MainActivity$Companion;", "", "()V", "MAX_FONT_SIZE", "", "REQUEST_GALLERY", "", "REQUEST_IMAGE_CAPTURE", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}