DarkSoulsCraft
==============

Bringing Dark Souls to Minecraft! (...eventually)

[![Build Status](https://travis-ci.org/ShooShoSha/DarkSoulsCraft.svg?branch=release)](https://travis-ci.org/ShooShoSha/DarkSoulsCraft)

# Wiki
As best of an attempt to document the mod on the [Wiki](https://github.com/ShooShoSha/DarkSoulsCraft/wiki)

# Issues
If you find a bug, exploit, or issue with using the mod open a topic on the [Issue Tracker](https://github.com/ShooShoSha/DarkSoulsCraft/issues)

# Contributing
In order to contribute to _this_ repository (repo), do the following:

## Get the Source
1. Fork this repo
2. Clone your forked repo onto your computer
3. Open command prompt/terminal within the _make_ folder
4. Run __one__ of the following commands:
  - Windows: `gradlew.bat [setupDecompWorkspace|setupDevWorkspace] [eclipse|idea]`
  - OSX: `bash gradlew [setupDecompWorkspace|setupDevWorkspace] [eclipse|idea]`
  - Linux: `./gradlew [setupDecompWorkspace|setupDevWorkspace] [eclipse|idea]`

The argument `setupDecompWorkspace` decompiles Minecraft code for reading how Mojang did it in game; `setupDevWorkspace` does not decompile Mojang's code. The argument `eclipse` should be used with the Eclipse IDE and `idea` for the IntelliJ IDEA IDE.

## Share your Changes
1. Click _Pull Request_
2. Click _Edit_
3. Select _our_ repo as the base fork and version branch
4. Select _your_ repo as the head fork with branch you're working on
5. Review your commits and differences
6. Click _Create Pull Request_
7. Title it what your goal in changing the code.
8. Comment with specifics and reasons it should merge with _our_ repo

After that, the changes will be reviewed. We may make comments on its acceptance, why it won't be accepted, or what would make it better before making the merge.

# License
(c) 2013-2016 ShooShoSha

[![Sources-License](https://img.shields.io/badge/Sources%20License-LGPLv3.0-blue.svg)](https://opensource.org/licenses/LGPL-3.0) [![Assets-License](https://img.shields.io/badge/Assets%20License-CC%20BY--NC--SA%204.0-blue.svg)](https://creativecommons.org/licenses/by-nc-sa/4.0/)
