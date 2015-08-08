import jfireeagle.*


ConsumerToken consumer = new ConsumerToken();
consumer.setPublicToken("xgxCTWkdBkQq");
consumer.setSecretToken("G1TF1aF5Mv3zEYDtc7dTj9m4uUJwzrmb");
UserSpecificAccessToken user = new UserSpecificAccessToken();
user.setPublicToken("KYu3V5dN2MdD");
user.setSecretToken("cB1KHjApl72EOBWQ7FVz4jRLU0yD89Yc");
ClientSettings settings = new ClientSettings();
settings.setConsumerToken(consumer);
settings.setUserSpecificToken(user);
FireEagleClient client = new FireEagleClient();
client.setClientSettings(settings);
client.updateLocation("240 SW Main Street, Portland Oregon");




Consumer Key:
    xgxCTWkdBkQq
Consumer Secret:
    G1TF1aF5Mv3zEYDtc7dTj9m4uUJwzrmb
General Purpose Token:
    KYu3V5dN2MdD
General Purpose Secret:
    cB1KHjApl72EOBWQ7FVz4jRLU0yD89Yc 


		