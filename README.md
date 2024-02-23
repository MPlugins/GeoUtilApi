<img src="assets/thumbnail.png">
<br>
*... still work in progress...*

## Features
- ✅ **Geo Blocking:** Prevent players from certain regions from joining on your server.
- ✅ **Free Developer API:** Free developer API, so anyone who wants can interact with this service.
- ✅ **Player Analytics:** Access geo analytics about your players, such as city they live in, country, continent, currency, etc.
- 🔒 **Ad targeting:** Get to know your players better by using geographical data to target your players needs the best.

## API Usage
While this API is free to use, you still need to buy the plugin to be able to use it. The plugin can be purchased [here](https://builtbybit.com/resources/player-geolocation.39748/) *(not public yet)*

### Preparation
Make sure you depend on this API in your `plugin.yml`.
> File: plugin.yml
>```yaml
>name: YourPlugin
>main: path.to.your.MainClass
>...
>depend:
>   - GeoUtil
>...
>```

### Maven
This is the maven setup. For more information about other build-systems (such as Gradle), visit https://repo.mplugins.net
```xml
<repositories>
    <repository>
        <id>mplugins-releases</id>
        <url>https://repo.mplugins.net/releases</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>net.mplugins</groupId>
        <artifactId>geoutil-api</artifactId>
        <version>VERSION_TAG</version> <!-- can be found in 'releases' -->
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### Adding a geo-blocked region
This is how you tell the API to block players from countries by providing the country code of that country:

```java
import net.mplugins.geoutil.api.GeoUtilApi;

import java.util.Locale;

@Override
public void onEnable() {
    // This is how to block players from Germany
    GeoUtilApi.getPermissionHandler().denyJoin(Locale.GERMANY.getCountry());

    // This is how to block players from USA
    GeoUtilApi.getPermissionHandler().denyJoin(Locale.US.getCountry());
}
```
