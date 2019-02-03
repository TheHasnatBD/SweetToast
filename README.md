## SweetToast is a toasting library
 
## Setup in gradle
### Step 1
Add it in your **root** `build.gradle` at the end of repositories:
```gradle
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}
```

### Step 2
Add the dependency
``` gradle
dependencies {
    ...
    implementation 'com.github.TheHasnatBD:sweettoast:1.0.0'
}
```

# Usage (Java)
## Default Toast
For short duration
``` java
 SweetToast.shortToast(context, "---YOUR-TEXT---");
```
For long duration
``` java
 SweetToast.longToast(context, "---YOUR-TEXT---");
```

## Custom Toast
For success

## (This Library is now Under Construction)
