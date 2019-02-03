# SweetToast
 
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
SweetToast.shortToast(context, "YOUR STRING");
```
To display default long Toast-
``` java
SweetToast.longToast(context, "YOUR STRING");
```

### SweetToast Default Toast
To display a success Toast-
``` java
SweetToast.success(context, "YOUR STRING", duration);
```
To display an info Toast-
``` java
SweetToast.info(context, "YOUR STRING", duration);
```
To display a warning Toast-
``` java
SweetToast.warning(context, "YOUR STRING", duration);
```
To display an error Toast-
``` java
SweetToast.error(context, "YOUR STRING", duration);
```
### Custom Toast
To display a partial-custom Toast-
``` java
// If you need...
// Only custom Icon >> in pre-defined backgroundColor and textColor : GRAY and BLACK
SweetToast.custom(context, "YOUR STRING", textColor, backgroundColor, duration);
```
To display a custom Toast without Icon-
``` java
SweetToast.custom(context, "YOUR STRING", textColor, backgroundColor, duration);
```

To display a FULLY custom Toast-
``` java
SweetToast.custom(context, "YOUR STRING", iconDrawable, textColor, backgroundColor/customShape, duration);
```

<br />
(Not compeleted yet supperCustom)
<br />

`supperCustom()` method returns a Toast object, so you can customize the Toast much more.
DON'T FORGET THE `show()` METHOD.
Supper Custom Toast-
``` java

```

- [SweetToast Demo App](https://github.com/TheHasnatBD/SweetToast/blob/master/app/src/main/java/xyz/hasnat/sweettoastlibrary/MainActivity.java)
- [SweetToast Usage Example in Java](https://github.com/TheHasnatBD/SweetToast/blob/master/app/src/main/java/xyz/hasnat/sweettoastlibrary/MainActivity.java)

