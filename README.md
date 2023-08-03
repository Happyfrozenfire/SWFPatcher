# Introduction
This is a "sequel" to my old program, [SSF2Patcher](https://github.com/Happyfrozenfire/jpexs-decompiler). SSF2Patcher was a modded fork of JPEXS designed to add new command-line patch functionality. This will replicate its functionality, add backwards compatibility for [Riley's Flash Patcher](https://github.com/rayyaw/flash-patcher), and work via launching a provided JPEXS jar path (as opposed to modding it directly).

# Planned Features
* SSF2Patcher export command 
* SSF2Patcher format command 
* SSF2Patcher replace command 
* SSF2Patcher replacebatch command 
* SSF2Patcher replacemethod command 
* makepatch command: automatically scan two SWFs, detect the differences between them, and generate the patch.
* applypatch command: apply patch to an input SWF, then save to an output SWF
* More commands to replicate command functionality as requested
* Custom swfp file format
* Backwards compatibility with formats related to Riley's Flash Patcher
* GUI for makepatch and applypatch commands 

