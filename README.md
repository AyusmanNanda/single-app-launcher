# Single App Launcher

A lightweight Android launcher that immediately launches a single application when the Home button is pressed.

The project is designed for dedicated devices such as media players, kiosks, tablets, dashboards, and repurposed Android phones.

## Features

* Registers as an Android Home launcher
* Lightweight and open source
* Launches the configured application immediately
* Built with Kotlin and Jetpack Compose
* Supports Android 7.0+ (API 24)

## Current Status

This project is currently in alpha.

The current implementation launches VLC as a temporary hardcoded target while the application selection system is under development.

## Installation

1. Download the latest APK from the Releases page.
2. Install the APK on your Android device.
3. Open the application.
4. Tap **Set as Default Launcher**.
5. Select **Single App Launcher** as your Home application.
6. Press the Home button.

## Use Cases

* Dedicated media players
* Information kiosks
* Digital signage
* Gallery displays
* Music devices
* Repurposed Android tablets
* Single-purpose Android devices

## Roadmap

### v0.2.0-alpha

* Application picker
* Remove hardcoded VLC dependency

### v0.3.0-alpha

* Persist selected application
* Improved setup experience

### Future

* Activity launcher support
* Home screen shortcut creation
* Intent-based launching
* Kiosk mode improvements

## Building

Requirements:

* Android Studio
* Android SDK 24+
* JDK 11+

Clone the repository:

```bash
git clone https://github.com/AyusmanNanda/single-app-launcher.git
cd single-app-launcher
```

Build using Android Studio or Gradle.

## License

This project is licensed under the MIT License.

## Contributing

Issues, feature requests, and pull requests are welcome.
