# SweetToast
[![](https://jitpack.io/v/TheHasnatBD/SweetToast.svg)](https://jitpack.io/#TheHasnatBD/SweetToast)
 <div align="center">
 	<img src="https://raw.githubusercontent.com/TheHasnatBD/SweetToast/master/files/logo.png" width="128">
 </div>
 
## Setup
**Step 1**<br />
Add it in your **root** `build.gradle` at the end of repositories:
```gradle
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}
```

**Step 2**<br />
Add the dependency
``` gradle
dependencies {
    ...
    implementation 'com.github.TheHasnatBD:SweetToast:1.0.0'
}
```

## Usage (Java)
### Android Default Toast
To display default short Toast-
``` java
SweetToast.defaultShort(context, "YOUR STRING");
```
To display default long Toast-
``` java
SweetToast.defaultLong(context, "YOUR STRING");
```

### SweetToast Default Toast
(without `duration` parameter every Toast's duration is `Toast.LENGTH_SHORT`)<br />
To display a success Toast-
``` java
SweetToast.success(context, "YOUR STRING");
SweetToast.success(context, "YOUR STRING", duration);
```
To display an info Toast-
``` java
SweetToast.info(context, "YOUR STRING");
SweetToast.info(context, "YOUR STRING", duration);
```
To display a warning Toast-
``` java
SweetToast.warning(context, "YOUR STRING");
SweetToast.warning(context, "YOUR STRING", duration);
```
To display an error Toast-
``` java
SweetToast.error(context, "YOUR STRING");
SweetToast.error(context, "YOUR STRING", duration);
```
### Custom Toast
(without `duration` parameter every Toast's duration is `Toast.LENGTH_SHORT`)<br />
To display a partial-custom Toast-
``` java
// Only custom Icon >> in pre-defined backgroundColor and textColor : GRAY and BLACK
SweetToast.custom(context, "YOUR STRING", drawableIcon, duration);
```
To display a custom Toast without Icon-
``` java
SweetToast.custom(context, "YOUR STRING", textColor, backgroundColor, duration);
```

To display a FULLY custom Toast-
``` java
SweetToast.custom(context, "YOUR STRING", drawableIcon, textColor, backgroundColor/customShape, duration);
```

<br />
(Not compeleted yet supperCustom)
<br />

`supperCustom()` method returns a Toast object, so you can customize the Toast much more.
DON'T FORGET THE `show()` METHOD.
Supper Custom Toast-
``` java

```
SweetToast.apk
 	

- [Download SweetToast Demo App](https://github.com/TheHasnatBD/SweetToast/blob/master/files/SweetToast.zip)
- [SweetToast Usage Example in Java](https://github.com/TheHasnatBD/SweetToast/blob/master/app/src/main/java/xyz/hasnat/sweettoastlibrary/MainActivity.java)

