# Easy-Injection

In this repository present short way for injections.

### Feature
- SharedPreferences injection

### Add to your gradle

````
//Application Level
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}

//Module Level
dependencies {
	compile 'com.github.apg-mobile:easy-injection:1.0.1'
}
````

### Initialize
```kotlin

class MyApplication : Application() {
    ...
    override fun onCreate() {
        super.onCreate()
        ...
        EasyInjection.init(this)
        ..
    }
    ...
}
```
### Example Code

```kotlin
//SharedPreference Injection
var name by stringPref()
var age by integerPref()
var millisecond by longPref()
var ratio by floatPref()
var isNumber by booleanPref()
var students by stringSetPref()
```
