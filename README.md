OpenKeeper
=================

An open source clone of the Dungeon Keeper II game and engine.

Goal is to fully implement the game (version 1.7 with 3 bonus packs) as open source cross platform version, with minimal or no changes at all, using the original game assets. So it will require the original game to play / develop. Futher development could have fan made graphics (to at least enable standalone version) and features.

OpenKeeper is written in Java using [JMonkeyEngine](http://jmonkeyengine.org/). Currently we are using JME 3.1 + Java 8.

[![Build Status](https://travis-ci.org/tonihele/OpenKeeper.svg)](https://travis-ci.org/tonihele/OpenKeeper)

[Here is my YouTube channel where I sometimes publish videos of the progress](https://www.youtube.com/user/Kaljis83/videos).

Contact
========

We have a super secret lair at [IRC channel #OpenKeeper on Freenode](https://webchat.freenode.net/?channels=OpenKeeper). Feel free to idle there. For more persistent discussion and/or feedback, try [this forum at keeperklan.com](https://keeperklan.com/forums/101-OpenKeeper).

Contributing
=============

We are always looking for talented people to join us. I'll try to create as many issues I possibly can and keep them simple and small. You can start from these or come join us on IRC or email. Pull requests are always welcome! See [how to set up the project](https://github.com/tonihele/OpenKeeper/wiki/How-to-set-up-OpenKeeper).

Please keep in mind:
 - Learn to use GIT (forking, pull requests, etc)
 - Coding style
    - Global variables on top
    - Javadoc on at least public & protected methods
    - Organize imports
    - Default Netbeans code formatting
    - Code header (the license)

- One feature per branch / commit
- If in doubt, ask! :)

TODO
====

- [ ] Read the original assets
  - [x] Extract WAD files
    - [x] Support compression
  - [x] Read meshes (meshes.wad -> kmf)
  - [x] Read maps (kwd, kld)
    - [ ] Reverse-engineer the still unknown flags (some of the are not of use thou)
  - [x] Read textures
    - [x] Names & entries
    - [x] Texture compression
    - [x] .444 files
  - [x] Read sounds
  - [x] Read cutscenes `(*`
  - [x] Read paths
    - [x] Read paths (paths.wad -> kcs)
    - [x] Understand paths
  - [x] Read cursors
  - [x] Read the GUI texts
  - [x] Read highscores
  - [x] Read sprites (not used in the game?)
  - ?
- [ ] Conversion of formats
  - [ ] Meshes to JMonkeyEngine j3o
    - [x] Basic mesh conversion
    - [x] LOD
    - [x] Animations `(**`
      - [ ] Integrate animations to the model itself (maybe, have to see the prefered usage)
      - [x] Vertex animations playing
    - [x] Materials
      - [x] All materials should exist only once, as JME material file
      - [x] EngineTextures.wad needs to be extracted
  - [ ] Maps to our open map format (XML, xstream?) `(***`
  - [ ] Sounds (MP2 is not supported by JME)
    - [x] MP2 decoding
    - [x] Finish up the MP2 asset loader
    - [ ] Merge the sound tracks
    - [ ] Decide what to do with the MAP files (playback events)
  - [x] Video playes for DK format `(*`
  - [x] Paths to JME MotionPaths & Cinematics
  - [x] Cursors
    - [x] Animated cursors
  - [x] GUI texts
  - ?
- [ ] Load maps to engine
- [ ] Basic world interaction
- [ ] Basic AI
- [ ] Main menu
- [ ] In game menu
- [ ] Save & load
- ?
  
`(*` low priority

`(**` vertex animations, we need our own animation control, JME doesn't support out of the box

`(***` The map format is awfully complex and complete (rules, effects, etc. the whole game really), so better hold this off for a long time and use the originals

License
==========

GNU GPLv3 or later. You should add license.txt to your IDE to appear as automatic header in code files.

Resources
=========

 * [Reversal of DK2 Binary File Formats](http://keeperklan.com/threads/4623-Reversal-of-DKII-Binary-File-Formats)
 * [DK2 texture formats](http://keeperklan.com/threads/220-DK2-texture-format)
 * [Jadex AgentKeeper, a Dungeon Keeper like game](https://code.google.com/p/jadex-agentkeeper/)
 * [kwd, library for loading kwd/klb files](https://github.com/werkt/kwd)
 * [Sound & Video formats](http://wiki.multimedia.cx/index.php?title=Electronic_Arts_Formats)
 * [A write-up about the walls in DK2](http://simonschreibt.de/gat/dungeon-keeper-2-walls/)

