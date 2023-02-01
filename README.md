<div align="center">
<img src="https://te.legra.ph/file/8234db16f1e9418b73005.png" align="center" style="width: 100%" />
<h1>BitGuardian: Another Bitwarden Client</h1>
</div>

<p align="center">
  <a href="https://www.android.com"><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
  <a href="https://www.github.com/marchingon12"><img src="https://forthebadge.com/images/badges/built-with-love.svg"/></a>
</p>

------

**Bottle** is a [FOSS](https://en.m.wikipedia.org/wiki/Free_and_open-source_software) Android application with the goal of making a native client with 

The whole reason I started this project is because I mainly disliked the outdated UI the Bitwarden team were using for mobile clients, but also due to the slowness of the app and complexity of the source code. Understandably, the Bitwarden Team wanted to build apps cross-platform using Xamarin with the programming language used for the official client is C#, which is mainly used for Windows desktop apps. Problem: Android developers != Windows developers, thus leading to less contributions and motivation to develop it further.

<div align="center">


[<img src="https://github.com/machiav3lli/oandbackupx/blob/034b226cea5c1b30eb4f6a6f313e4dadcbb0ece4/badge_github.png" alt="Get it on GitHub" height="65">](https://github.com/marchingon12/BitGuardian/releases/latest)

</div>

------

<h2 align="center">Screenshots</h2>

| ![](https://te.legra.ph/file/efaa1f70b56c2ce1af969.jpg) | ![](https://te.legra.ph/file/4344ce91092a05f2007f9.jpg) | ![](https://te.legra.ph/file/b1b1578b3b01436d80bba.jpg) | ![](https://te.legra.ph/file/4902644c0b32e1be4c9f0.jpg) |
|--------------------------------------------------------|--------------------------------------------------------|--------------------------------------------------------|--------------------------------------------------------|
| ![](https://te.legra.ph/file/828b97b5b1bd5730d40f6.jpg) | ![](https://te.legra.ph/file/4898106707bf8b38403ab.jpg) | ![](https://te.legra.ph/file/655a59bb2537492730888.jpg) | ![](https://te.legra.ph/file/d7db728fa2201be8b31df.jpg) |

------

<h2 align="center">Highlights</h2>

- Clean & beautiful UI based on Google's [material design three](https://m3.material.io/) guidelines.
- Same goodies & functionality as with the official Bitwarden client, just faster and more reliable.
- Compatible with Android 10.0 and above (API 29+), no guarantee for older versions.
- Supports [Material You](https://www.androidpolice.com/everything-we-love-about-material-you/amp/) theming in devices running on Android 12+

------

<h2 align="center">Translations</h2>

If you want to make app available in your language, you're very welcome to create a [pull request](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests) with your translation file.
The string resources can be found under `/app/src/main/res/values/strings.xml`. It is easiest to make a translation using the Android Studio XML editor, but you can always go with your favorite XML-text editor instead.
Checkout this guide to learn more about translation strings from [Helpshift](https://developers.helpshift.com/android/i18n/) for Android.

------

<h2 align="center">Donations</h2>



[![Github-sponsors](https://img.shields.io/badge/sponsor-30363D?style=for-the-badge&logo=GitHub-Sponsors&logoColor=#EA4AAA)](https://github.com/sponsors/starry-shivam)
[![Bitcoin](https://img.shields.io/badge/Bitcoin-000?style=for-the-badge&logo=bitcoin&logoColor=white)](https://www.blockchain.com/btc/address/bc1q82qh9hw5xupwlf0f3ddfud63sek53lavk6cf0k)
[![Ethereum](https://img.shields.io/badge/Ethereum-3C3C3D?style=for-the-badge&logo=Ethereum&logoColor=white)](https://www.blockchain.com/eth/address/0x9ef20ad6FBf1985e6eF6ea6337ad800Cb8126eD3)
![](https://img.shields.io/badge/starry%40airtel-UPI-red?style=for-the-badge)

------

<h2 align="center">Tech Stack</h2>

- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - To improve performance by doing I/O tasks out of main thread asynchronously.
- [Flow](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
    - [Jetpack Compose](https://developer.android.com/jetpack/compose?gclsrc=ds&gclsrc=ds) - Jetpack Compose is Android’s recommended modern toolkit for building native UI
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
- [OkHttp3](https://square.github.io/okhttp/) - OkHttp is an HTTP client for Android that’s efficient by default.
- [Gson](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back.
- [Coil](https://coil-kt.github.io/coil/compose/) - An image loading library for Android backed by Kotlin Coroutines.
- [Dagger-Hilt](https://dagger.dev/hilt/) For [Dependency injection (DI)](https://developer.android.com/training/dependency-injection)
- [Room database](https://developer.android.com/jetpack/androidx/releases/room) - Persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

------

<h2 align="center">License</h2>

[Apache License 2.0][license] © [Stɑrry Shivɑm][github]

[license]: /LICENSE
[github]: https://github.com/starry69

```
Copyright 2022 - 2023 Stɑrry Shivɑm

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```