import React, {Component} from 'react';
import {
  Text,
  View,
  Button,
  NativeModules,
  TouchableOpacity,
} from 'react-native';
import DeviceInfo from 'react-native-device-info';

var HelloWorld = NativeModules.HelloWorld;

var getHardwareAndSoftwareInfo = NativeModules.getHardwareAndSoftwareInfo;

export class AppStartUp extends Component {
  _getIPAddress = () => {
    DeviceInfo.getIpAddress().then((getIpAddress) => {
      console.log('IPAddress', getIpAddress);
    });
  };
  _getPowerState = () => {
    DeviceInfo.getTotalMemory().then((getTotalMemory) => {
      console.log('PowerState', getTotalMemory);
    });
  };
  async sayHiFromJava() {
    console.log('getHardwareAndSoftwareInfo', getHardwareAndSoftwareInfo);
    HelloWorld.getHardwareAndSoftwareInfo(
      (err) => {
        console.log(err);
      },
      (msg) => {
        console.log(msg);
      },
    );
  }

  render() {
    return (
      <View>
        <Button title="IPAddress" onPress={this._getIPAddress} />
        <Button title="PowerState" onPress={this._getPowerState} />
        <TouchableOpacity onPress={this.sayHiFromJava}>
          <Text>Invoke native Java code</Text>
        </TouchableOpacity>
      </View>
    );
  }
}
