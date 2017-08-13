# Multiple Screen Layouts

In this tutorial you will learn about Android design techniques for SmartPhone and Tablet implementing qualifiers and using Fragments to populate and display data.

## Sumary concepts & general documentation

dpi quantity of pixels within a given physical area
dp density independent pixels, independent of the device screen
sp scale independent pixels
Screen Orientation : Portrait and Landscape

### Screen Sizes:
Small: 2" - 3.7"
Normal: 3.7" - 4.3"
Large: 4" - 7"
xLarge: 7" - 10.0"

### Screen Resolution:
Half HD: 720 x 1280px
Full HD: 1080 x 1920px

### Screen Density:	
Low: [LDPI] 120dpi PER INCH
Medium: [MDPI] 160dpi PER INCH
High: [HDPI] 240dpi PER INCH
Extra High: [XHDPI] 320dpi PER INCH
XX High: [XXHDPI] 480dpi PER INCH
XXX High [XXXHDPI] 640dpi PER INCH

### GOLDEN RULE
Ldpi : mdpi : hdpi : xhdpi : xxhdpi : xxxhdpi
0.75x  1x     1.5x   2x      3x       4x

px = 1dp * (dpi/160);

### Excercise calculate pixels for 120dpi, 160dpi, 240dpi, 320dpi
px = 1dp * (120dpi/160);
px = 0.75px
For Low[LDPI] 1dp = 0.75px;

px = 1dp * (160dpi/160);
px = 1px
For Medium[MDPI] 1dp = 1px;

px = 1dp * (240dpi/160)
px = 1.5px
For High[HDPI] 1dp = 1.5px;

px = 1dp * (320dpi/160)l
px = 2px
For xHigh[XHDPI] 1dp = 2px;

### Configuration Qualifiers
for drawable and mipmap 
res/{0}-hdpi
res/{0}-mdpi
res/{0}-xhdpi
res/{0}-xxhdpi
res/{0}-xxxhdpi

### Excercise determine picture size based in scale factor (Golden Rule)

LDPI 75px * 75px
MDPI 100px * 100px
HDPI 150px * 150px
XHDPI 200px * 200px
XXHDPI 300px * 300px
XXXHDPI 400px * 400px

### Resources qualifiers
sw Smallest Possible Width / Height
w Available Width
h Available Heigth

### Examples for layouts, problem to maintain???
Layout => activity_main.xml
Layout-land => activity_main.xml

Layout-sw480dp-port => activity_main.xml
Layout-sw480dp-land => activity_main.xml

Layout-sw600dp-port => activity_main.xml
Layout-sw600dp-land => acivity_main.xml 

### Android compatibility 3.2 Above (API 13+)
sw,w,h

### Android layout aliases
ALL APIS
layout
values  

Android compatibility 3.2 Above(API 13+)
values-sw600dp-port
values-sw600dp-land

Android compatibility 3.2 Below (API 7+)
values-xlarge-port
values-xlarge-land



















