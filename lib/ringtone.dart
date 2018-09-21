import 'dart:async';

import 'package:flutter/services.dart';

class Ringtone {
  static const MethodChannel _channel = const MethodChannel('ringtone');

  static Future play() => _channel.invokeMethod('play', {});

  static Future stop() => _channel.invokeMethod('stop', {});
}
