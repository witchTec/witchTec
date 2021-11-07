package com.example.testpose;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


class  pose_detect implements ImageAnalysis.Analyzer {

    @Override
    public void analyze(ImageProxy imageProxy) {
        Image mediaImage = imageProxy.getImage();
        if (mediaImage != null) {
            InputImage image =
                    InputImage.fromMediaImage(mediaImage, imageProxy.getImageInfo().getRotationDegrees());
            // Pass image to an ML Kit Vision API
            // ...
        }
    }
}