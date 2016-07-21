# This was called to generate the classes in src/main/java/nl/vpro/domain/media/projectm/metadata/
# The result was checked in. If the XSD changes it can be run again.
PACKAGE:=nl.vpro.smil
DIR:=src/main/java/$(subst .,/,$(PACKAGE))



$(DIR)/ObjectFactory.java:
	mkdir -p src/main/java
	xjc -p $(PACKAGE).projectm.metadata -d src/main/java 	src/main/resources/smil20.xsd
