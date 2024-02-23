*... still work in progress...*

## Features
- ✅ **Geo Blocking:** Prevent players from certain regions from joining on your server.
- 🔒 **Player Analytics:** Access geo analytics about your players, such as city they live in, country, continent, currency, etc.
- 🔒 **Ad targeting:** Get to know your players better by using geographical data to target your players needs the best.
- 🔒 **Free Developer API:** Free developer API, so anyone who wants can interact with this service.

## API Usage
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