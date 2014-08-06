XspDojoXLib
==============

XPages library with DojoX components.

To build issue this command:

```
mvn clean install -Dnotes-platform=file:///c:/lotus/p2repo
```

where c:/lotus/repository is a path to a p2 repository where all the plugins of the domino runtime are located.

The p2 repository can be generated with following script (in PowerShell):

```
$eclipse = "C:\eclipse"
$lotus = "C:\lotus\notes"
$dominop2 = "c:\lotus\p2repo"

$el = ls $eclipse\plugins\org.eclipse.equinox.launcher_*
$el = $el[0].name

java -jar $eclipse\plugins\$el `
-application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher `
-metadataRepository file:/$dominop2 `
-artifactRepository file:/$dominop2 `
-source $lotus\osgi\shared\eclipse `
-configs ANY.ANY.ANY `
-compress `
-publishArtifacts

java -jar $eclipse\plugins\$el `
-application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher `
-metadataRepository file:/$dominop2 `
-artifactRepository file:/$dominop2 `
-source $Lotus\osgi\rcp\eclipse `
-configs ANY.ANY.ANY `
-compress `
-publishArtifacts `
-append
```
