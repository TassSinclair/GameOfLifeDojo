# Game of Life dojo

A coding dojo based on [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway's_Game_of_Life).

This is mostly template code, plus a sequence of steps to follow to get it up and running.

## Goals:

- Implement game rules and components of the main game loop.
- Use driver and navigator pairing, speaking aloud to discuss ideas and intentions.
- Practice Test Driven Development to ensure test expectations drive the creation of production code.

## Getting it up and running

*Note: The goal is to run Eclipse in a Windows VM, to minimise disruption for Windows/Eclipse users.*

1. Grab a [Windows 7 VM](http://dev.modern.ie/tools/vms/mac/).
2. Grab an [Eclipse JEE installation](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/mars/R/eclipse-jee-mars-R-win32-x86_64.zip).
3. Set up VM as a new guest machine. *The following steps are performed on the VM.*
4. Extract Eclipse.
5. Install Git.
6. Install Java.
7. Clone this repository to a local folder.
8. In Eclipse, install the plugins [Infinitest](http://infinitest.github.io/), [MoreUnit](http://moreunit.sourceforge.net/#download)
9. Import a similar formatter to that used by the dojo attendees.
10. Set save actions to auto-save, format on save and import on save.
11. Set up the static imports for `org.assertj.core.api.Assertions.assertThat`