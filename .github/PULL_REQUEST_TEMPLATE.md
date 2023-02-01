### Pull Request checklist
<!-- Before submitting the PR, please address each item -->
- [ ] **Tests**: This PR includes thorough tests or an explanation of why it does not
- [ ] **Screenshots**: This PR includes screenshots or GIFs of the changes made or an explanation of why it does not

### To download an APK when reviewing a PR:
The PR runs an Android build check (`run-build`) that builds a `forkRelease` variant of the app. If it succeeds, then we upload the apks (signed with debug keys) via Github actions. We also generate a comment with some instructions and a link to help you find the downloads. You can also follow the instructions below:
1. Click Details next to "run-build (pull_request_target)" after it finishes with a green checkmark.
2. Click the "Artifacts" drop-down near the top right of the page.
3. The apk links should be present in the drop-down menu. You can click on the suitable CPU architecture to download a zipped apk file.
4. Unzip the file and install the apk.