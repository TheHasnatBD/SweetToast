# SweetToast
 
## Setup
**Step 1**
Add it in your **root** `build.gradle` at the end of repositories:
```gradle
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}
```

**Step 2**
Add the dependency
``` gradle
dependencies {
    ...
    implementation 'com.github.TheHasnatBD:SweetToast:1.0.0'
}
```

# Usage (Java)
### Default Toast
**For short duration**
``` java
SweetToast.shortToast(context, "YOUR STRING");
```
**For long duration**
``` java
SweetToast.longToast(context, "YOUR STRING");
```

### Custom Toast
**For success**
``` java
SweetToast.success(context, "YOUR STRING", duration);
```
**For info**
``` java
SweetToast.info(context, "YOUR STRING", duration);
```
**For warning**
``` java
SweetToast.warning(context, "YOUR STRING", duration);
```

**For error**
``` java
SweetToast.error(context, "YOUR STRING", duration);
```


**(This Library is now Under Construction)**
