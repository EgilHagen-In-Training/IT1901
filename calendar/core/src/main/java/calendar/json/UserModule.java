package calendar.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.Version;

import calendar.core.Calendar;
import calendar.core.Event;

@SuppressWarnings("serial")
public class UserModule extends SimpleModule {
    
    private static final String NAME = "UserModule";

    /**
     * Initializes this UserModule with appropriate serializers and deserializers.
     */
    public UserModule(boolean deepTodoModelSerializer) {
      super(NAME, Version.unknownVersion());

    }

    public UserModule() {
      this(true);
    }
}
