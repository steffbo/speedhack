package de.steffbo.speedhack;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {

	private static final Logger LOGGER = LogManager.getLogger();

	private static Properties properties;

	public static String getProperty(String key) {

		if (properties == null) {

			try {
				properties = new Properties();
				InputStream stream = Util.class.getClassLoader()
						.getResourceAsStream("config.properties");

				properties.load(stream);
				stream.close();
			} catch (IOException e) {
				LOGGER.error(e.getMessage());
			}
		}

		return properties.getProperty(key);
	}

}
