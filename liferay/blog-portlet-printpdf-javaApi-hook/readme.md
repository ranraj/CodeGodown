Problem : How to create pdf of the selected blog post in the blogs portlet.

Solution : Use javascript based pdf genreated library, to convert the blog html to pdf.

Liferay Api : DocumentConversionUtil.convert

```
entry = BlogsEntryServiceUtil.getEntry(entryId);
InputStream is = new UnsyncByteArrayInputStream(entry.getContent().toString().getBytes(StringPool.UTF8));
destinationFile = DocumentConversionUtil.convert(entry.getEntryId()+ "", is, "html", "pdf");
```

This is the default implemenation provided by liferay to convert document to pdf. I has been used in may built
in portlet like Document and medica libraray.

DocumentConvertionUtil Api required OpenOffice service to be already running and configured in the portal server.

Ref url : https://web.liferay.com/community/wiki/-/wiki/Main/Document+Conversion+with+OpenOffice
