<div align="center">
<img src="https://te.legra.ph/file/8234db16f1e9418b73005.png" align="center" style="width: 100%" />
<h1>Bottle: A Send Client Built For Android</h1>
</div>

<p align="center">
  <a href="https://www.android.com"><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
  <a href="https://www.github.com/marchingon12"><img src="https://forthebadge.com/images/badges/built-with-love.svg"/></a>
</p>

------

**Bottle** is a [FOSS][wiki] Android application with the goal of making a native Android client for quickly uploading and downloading files with simplicity and flexibility using the [Send][send] service.

[wiki]: https://en.m.wikipedia.org/wiki/Free_and_open-source_software
[send]: https://github.com/timvisee/send

<div align="center">


[<img src="https://github.com/machiav3lli/oandbackupx/blob/034b226cea5c1b30eb4f6a6f313e4dadcbb0ece4/badge_github.png" alt="Get it on GitHub" height="65">](https://github.com/marchingon12/Bottle/releases/latest)

</div>

------

<h2 align="center">Screenshots</h2>

| ![](https://te.legra.ph/file/efaa1f70b56c2ce1af969.jpg) | ![](https://te.legra.ph/file/4344ce91092a05f2007f9.jpg) | ![](https://te.legra.ph/file/b1b1578b3b01436d80bba.jpg) | ![](https://te.legra.ph/file/4902644c0b32e1be4c9f0.jpg) |
|--------------------------------------------------------|--------------------------------------------------------|--------------------------------------------------------|--------------------------------------------------------|
| ![](https://te.legra.ph/file/828b97b5b1bd5730d40f6.jpg) | ![](https://te.legra.ph/file/4898106707bf8b38403ab.jpg) | ![](https://te.legra.ph/file/655a59bb2537492730888.jpg) | ![](https://te.legra.ph/file/d7db728fa2201be8b31df.jpg) |

------

<h2 align="center">Highlights</h2>

- Clean & beautiful UI based on Google's [material design 3][md3] guidelines.
- Same goodies & functionality for Send just as you would on a browser, brought onto native Android.
- Compatible with Android 7.1 and above (API 25+), no guarantee for older versions.
- Supports [Material You][material-you] theming in devices running on Android 12+

[md3]: https://m3.material.io/
[material-you]: https://www.androidpolice.com/everything-we-love-about-material-you/amp/

------

<h2 align="center">Translations</h2>

If you want to make app available in your language, you're very welcome to create a [pull request][gh-pr] with your translation file.
The string resources can be found under `/app/src/main/res/values/strings.xml`. It is easiest to make a translation using the Android Studio XML editor, but you can always go with your favorite XML-text editor instead.
Checkout this guide to learn more about translation strings from [Weblate][weblate] for Android.

[gh-pr]: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests
[weblate]: https://developers.helpshift.com/android/i18n/

------

<h2 align="center">Donations</h2>



[![Github-sponsors](https://img.shields.io/badge/sponsor-30363D?style=for-the-badge&logo=GitHub-Sponsors&logoColor=#EA4AAA)](https://github.com/sponsors/starry-shivam)
[![Bitcoin](https://img.shields.io/badge/Bitcoin-000?style=for-the-badge&logo=bitcoin&logoColor=white)](https://www.blockchain.com/btc/address/bc1q82qh9hw5xupwlf0f3ddfud63sek53lavk6cf0k)
[![Ethereum](https://img.shields.io/badge/Ethereum-3C3C3D?style=for-the-badge&logo=Ethereum&logoColor=white)](https://www.blockchain.com/eth/address/0x9ef20ad6FBf1985e6eF6ea6337ad800Cb8126eD3)
![](https://img.shields.io/badge/starry%40airtel-UPI-red?style=for-the-badge)

------

<h2 align="center">Tech Stack</h2>

- [Kotlin][kotlin] - First class and official programming language for Android development.
- [Coroutines][co-routines] - To improve performance by doing I/O tasks out of main thread asynchronously.
- [Flow](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components][arch] - Collection of libraries that help you design robust, testable, and maintainable apps.
    - [Jetpack Compose][compose] - Jetpack Compose is Android’s recommended modern toolkit for building native UI
    - [LiveData][livedata] - Data objects that notify views when the underlying database changes.
    - [ViewModel][viewmodel] - Stores UI-related data that isn't destroyed on UI changes.
- [OkHttp3][http] - OkHttp is an HTTP client for Android that’s efficient by default.
- [Gson][gson] - A Java serialization/deserialization library to convert Java Objects into JSON and back.
- [Coil][coil] - An image loading library for Android backed by Kotlin Coroutines.
- [Dagger-Hilt][dagger] For [Dependency injection (DI)][inject]
- [Room database][room] - Persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

[kotlin]: https://kotlinlang.org/
[co-routines]: https://kotlinlang.org/docs/reference/coroutines-overview.html
[arch]: https://developer.android.com/topic/libraries/architecture
[compose]: https://developer.android.com/jetpack/compose?gclsrc=ds&gclsrc=ds
[livedata]: https://developer.android.com/topic/libraries/architecture/livedata
[viewmodel]: https://developer.android.com/topic/libraries/architecture/viewmodel
[http]: https://square.github.io/okhttp/
[gson]: https://github.com/google/gson
[coil]: https://coil-kt.github.io/coil/compose/
[dagger]: https://dagger.dev/hilt/
[inject]: https://developer.android.com/training/dependency-injection
[room]: https://developer.android.com/jetpack/androidx/releases/room

------

<h2 align="center">License</h2>

[MIT License][license] © [Austin Hornhead][github]

[license]: /LICENSE
[github]: https://github.com/marchingon12

```
Copyright (c) 2023-present Austin Hornhead
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```