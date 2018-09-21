package com.github.peterzagoranski.flutter.ringtone;

import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** RingtonePlugin */
public class RingtonePlugin implements MethodCallHandler {
  private RingtonePlugin(Registrar registrar){
    this.ringtone = RingtoneManager.getRingtone(registrar.context().getApplicationContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));
    this.ringtone.setStreamType(AudioManager.STREAM_ALARM);
  }

  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "ringtone");
    channel.setMethodCallHandler(new RingtonePlugin(registrar));
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    switch (call.method) {
      case "play": {
        ringtone.play();
        result.success(null);
      } break;

      case "stop": {
        ringtone.stop();
        result.success(null);
      } break;

      default: {
        result.notImplemented();
      }
    }
  }

  private final Ringtone ringtone;
}
