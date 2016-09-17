This liferay project has contain codes for fetching document library image programaticaly.

Its a portlet plugin and it uses site custom filed called "banner-name" (Text field)
Register your site specific image name in this field , and that image should be already uploaded to the sitespecific document library.

Getting Expando - Custom field value
```
String expandoValue = themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("banner-name").toString();
```

Reading FileEnty from Document libaray
```
FileEntry fe = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), 0, expandoValue);
```

Getting File from FileEntry
```
File file = (DLFileEntryLocalServiceUtil.getFile(fe.getUserId(), fe.getFileEntryId(), fe.getVersion(), true));
```

Dynamic link to the  Document library image

```
url = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+fe.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
```
