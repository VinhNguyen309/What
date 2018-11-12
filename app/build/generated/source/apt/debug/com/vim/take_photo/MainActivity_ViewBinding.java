// Generated code from Butter Knife. Do not modify!
package com.vim.take_photo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.takePicture = Utils.findRequiredViewAsType(source, R.id.takePicture, "field 'takePicture'", Button.class);
    target.imageUploadProgress = Utils.findRequiredViewAsType(source, R.id.imageProgress, "field 'imageUploadProgress'", ProgressBar.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.spinnerVisionAPI = Utils.findRequiredViewAsType(source, R.id.spinnerVisionAPI, "field 'spinnerVisionAPI'", Spinner.class);
    target.visionAPIData = Utils.findRequiredViewAsType(source, R.id.visionAPIData, "field 'visionAPIData'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.takePicture = null;
    target.imageUploadProgress = null;
    target.imageView = null;
    target.spinnerVisionAPI = null;
    target.visionAPIData = null;
  }
}
