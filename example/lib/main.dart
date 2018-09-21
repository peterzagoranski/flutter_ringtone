import 'package:flutter/material.dart';
import 'package:ringtone/ringtone.dart';

void main() => runApp(new MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => new _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: new Scaffold(
        appBar: new AppBar(
          title: const Text('Plugin ringtone app'),
        ),
        body: new Center(
          child: new Text('Ringtone'),
        ),
        persistentFooterButtons: <Widget>[
          new FlatButton(
            onPressed: () {
              Ringtone.stop();
            },
            child: const Text('Stop')
          ),
          new FlatButton(
            onPressed: () {
              Ringtone.play();
            },
            child: const Text('Play')
          ),
        ],
      ),
    );
  }
}
