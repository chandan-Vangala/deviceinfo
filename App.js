/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
//import DeviceInfo from 'react-native-device-info';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  Button,
  StatusBar,
} from 'react-native';
import {AppStartUp} from './AppStartUp';

const App: () => React$Node = () => {
  return (
    <View>
      <AppStartUp />
    </View>
  );
};

export default App;
