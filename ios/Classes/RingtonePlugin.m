#import "RingtonePlugin.h"
#import <ringtone/ringtone-Swift.h>

@implementation RingtonePlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftRingtonePlugin registerWithRegistrar:registrar];
}
@end
