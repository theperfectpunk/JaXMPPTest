package com.tokas;

import tigase.jaxmpp.core.client.BareJID;
import tigase.jaxmpp.core.client.JID;
import tigase.jaxmpp.core.client.SessionObject;
import tigase.jaxmpp.core.client.exceptions.JaxmppException;
import tigase.jaxmpp.core.client.xmpp.modules.chat.Chat;
import tigase.jaxmpp.core.client.xmpp.modules.chat.MessageModule;
import tigase.jaxmpp.core.client.xmpp.stanzas.Message;
import tigase.jaxmpp.j2se.Jaxmpp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final Jaxmpp contact = new Jaxmpp();

        try {
            tigase.jaxmpp.j2se.Presence.initialize(contact);
        } catch (JaxmppException jax) {
            jax.printStackTrace();
        }

        contact.getModulesManager().register(new MessageModule());

        contact.getProperties().setUserProperty()
    }
}
