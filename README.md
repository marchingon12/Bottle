<div align="center">
  <img src="git-media" align="center" style="width: 100%" />
  <h1>Bottle: A Send Client Built For Android</h1>
</div>

<p align="center">
  <a href="https://www.android.com"><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
  <a href="https://www.github.com/marchingon12"><img src="https://forthebadge.com/images/badges/built-with-love.svg"/></a>
</p>

<p align="center">
  <img alt="GitHub" src="https://img.shields.io/github/license/marchingon12/Bottle">
  <img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/marchingon12/Bottle">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/marchingon12/Bottle">
  <a href="https://www.repostatus.org/#active"><img src="https://www.repostatus.org/badges/latest/active.svg" alt="Project Status: Active – The project has reached a stable, usable state and is being actively developed." /></a>
  <a href="https://hosted.weblate.org/engage/bottle/"><img src="https://hosted.weblate.org/widgets/bottle/-/bottle-translations/svg-badge.svg" alt="Translation status" />
  </a>
  <a href="https://dsc.gg/the-cattery"><img alt="Discord" src="https://discordapp.com/api/guilds/989024866810355713/widget.png?style=shield"></a>
  <img alt="build-workflow"src="https://github.com/marchingon12/Bottle/actions/workflows/android.yml/badge.svg">
  <!-- img alt="build-workflow"src="https://github.com/marchingon12/Bottle/actions/workflows/release.yml/badge.svg" -->

</p>


------

**Bottle** is a [FOSS][wiki] Android application with the goal of making a native Android client for quickly uploading and downloading files with simplicity and flexibility using the [Send][send] service.

[wiki]: https://en.m.wikipedia.org/wiki/Free_and_open-source_software
[send]: https://github.com/timvisee/send

<div align="center">

[<img src="https://raw.githubusercontent.com/deckerst/common/main/assets/get-it-on-github.png" alt="Get it on GitHub" height="65">](https://github.com/marchingon12/Bottle/releases/latest)

</div>

------

<h2 align="center">Screenshots</h2>

| ![]() | ![](git-media) | ![]() | ![]() |
| ----- | -------------- | ----- | ----- |
| ![]() | ![]()          | ![]() | ![]() |

------

<h2 align="center">Highlights</h2>

- Clean & beautiful UI based on Google's [Material Design 3][md3] guidelines.
- Same goodies & functionality for Send just as you would on a browser, brought onto native Android.
- Compatible with Android 7.1 and above (API 25+), no guarantee for older versions.
- Supports [Material You][material-you] theming in devices running on Android 12+

[md3]: https://m3.material.io/
[material-you]: https://www.androidpolice.com/everything-we-love-about-material-you/amp/

---

<h2 align="center">Translations</h2>


<p align="center">
	<a href="https://hosted.weblate.org/engage/bottle/">
		<img src="https://hosted.weblate.org/widgets/bottle/-/bottle-translations/open-graph.png" alt="Translation status" height="250" />
	</a>
</p>

If you want to make Bottle available in your language, please make sure you are familiar with Weblate and speak your native language (don't try to translate languages you aren't fluent in please).
The string resources can be found under `/app/src/main/res/values/strings.xml`.
Checkout this guide to learn more about translation strings from [Weblate][weblate] for Android.

[weblate]: https://docs.weblate.org/en/latest/formats.html#aresource

------

<h2 align="center">Donations & Support</h2>


<p align="center">
  <a href="https://paypal.me/austinhornhead12"><img src="https://raw.githubusercontent.com/andreostrovsky/donate-with-paypal/master/blue.svg" height="50"></a>
<a href="https://www.buymeacoffee.com/austinsama12"><img src="https://img.buymeacoffee.com/button-api/?text=Buy me a cuppa <3&emoji=🍵&slug=austinsama12&button_colour=FF5F5F&font_colour=ffffff&font_family=Lato&outline_colour=000000&coffee_colour=FFDD00"/></a>
  <a href="https://dsc.gg/the-cattery"><img src="https://raw.githubusercontent.com/tandpfun/skill-icons/main/icons/Discord.svg" height="50"></a>

</p>


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

---

<h2 align="center">Contributors</h2>


![GitHub Contributors Image](https://contrib.rocks/image?repo=marchingon12/Bottle)
